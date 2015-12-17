package gdx.scala.demo

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.physics.bullet.Bullet

class GdxScalaDemoGame extends ApplicationAdapter {
  private[demo] var batch: SpriteBatch = null
  private[demo] var img: Texture = null

  override def create() {
    Bullet.init()
    batch = new SpriteBatch
    img = new Texture("badlogic.jpg")
  }

  override def render() {
    Gdx.gl.glClearColor(1, 0, 0, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.begin()
    batch.draw(img, 0, 0)
    batch.end()
  }
}