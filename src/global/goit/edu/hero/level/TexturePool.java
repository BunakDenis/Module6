package global.goit.edu.hero.level;

public class TexturePool {

    private static TexturePool instance = new TexturePool();
    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }

    public static TexturePool getInstance() {
        return instance;
    }

    private TexturePool() {
    }
}
