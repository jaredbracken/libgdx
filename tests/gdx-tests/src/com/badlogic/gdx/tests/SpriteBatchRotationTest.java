/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.tests;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.tests.utils.GdxTest;

public class SpriteBatchRotationTest extends GdxTest {
	SpriteBatch spriteBatch;
	Texture texture;
	// Font font;
	float angle = 0;
	float scale = 1;
	float vScale = 1;
	IntBuffer pixelBuffer;

	@Override
	public void render () {
		Gdx.graphics.getGL10().glClear(GL10.GL_COLOR_BUFFER_BIT);
		spriteBatch.begin();
		spriteBatch.draw(texture, 16, 10, 16, 16, 32, 32, 1, 1, 0, 0, 0, texture.getWidth(), texture.getHeight(), false, false);
		spriteBatch.draw(texture, 64, 10, 32, 32, 0, 0, texture.getWidth(), texture.getHeight(), false, false);
		spriteBatch.draw(texture, 112, 10, 0, 0, texture.getWidth(), texture.getHeight());

		spriteBatch.draw(texture, 16, 58, 16, 16, 32, 32, 1, 1, angle, 0, 0, texture.getWidth(), texture.getHeight(), false, false);
		spriteBatch.draw(texture, 64, 58, 16, 16, 32, 32, scale, scale, 0, 0, 0, texture.getWidth(), texture.getHeight(), false,
			false);
		spriteBatch.draw(texture, 112, 58, 16, 16, 32, 32, scale, scale, angle, 0, 0, texture.getWidth(), texture.getHeight(),
			false, false);
		spriteBatch.draw(texture, 160, 58, 0, 0, 32, 32, scale, scale, angle, 0, 0, texture.getWidth(), texture.getHeight(), false,
			false);

		// spriteBatch.drawText(font, "Test", 208, 10, Color.WHITE);
		spriteBatch.end();
		Gdx.graphics.getGL10().glFlush();

		// if( false )
		// {
		// Gdx.graphics.getGL10().glReadPixels( 16, 10, 1, 1, GL10.GL_RGBA,
		// GL10.GL_UNSIGNED_BYTE, pixelBuffer );
		// if( pixelBuffer.get(0) != 0xff00ff00 )
		// throw new GdxRuntimeException( "not pixel perfect!" );
		// Gdx.graphics.getGL10().glReadPixels( 47, 10, 1, 1, GL10.GL_RGBA,
		// GL10.GL_UNSIGNED_BYTE, pixelBuffer );
		// if( pixelBuffer.get(0) != 0xffff0000 )
		// throw new GdxRuntimeException( "not pixel perfect!" );
		// Gdx.graphics.getGL10().glReadPixels( 16, 41, 1, 1, GL10.GL_RGBA,
		// GL10.GL_UNSIGNED_BYTE, pixelBuffer );
		// if( pixelBuffer.get(0) != 0xff0000ff )
		// throw new GdxRuntimeException( "not pixel perfect!" );
		// }

		angle += 20 * Gdx.graphics.getDeltaTime();
		scale += vScale * Gdx.graphics.getDeltaTime();
		if (scale > 2) {
			vScale = -vScale;
			scale = 2;
		}
		if (scale < 0) {
			vScale = -vScale;
			scale = 0;
		}

	}

	@Override
	public void create () {
		spriteBatch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/test.png"));
		// font = Gdx.graphics.newFont("Arial", 12, FontStyle.Plain);
		ByteBuffer buffer = ByteBuffer.allocateDirect(4);
		buffer.order(ByteOrder.nativeOrder());
		pixelBuffer = buffer.asIntBuffer();

	}

	@Override
	public boolean needsGL20 () {
		return false;
	}
}
