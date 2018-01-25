package gdx.menu.Screens;
import com.badlogic.gdx.Game;
import gdx.menu.Screens.ScrMenu;
import gdx.menu.Screens.ScrGameover;




public class GamMenu extends Game {
    public static Object menu;
    ScrMenu scrMenu;
    ScrGameover scrGameover;
    int nScreen; // 0 for menu, 1 for play, 2 for gameover, 3 for options
    
    public void updateState(int _nScreen) {
        nScreen = _nScreen;
        if ( nScreen == 0) {
            setScreen(scrMenu);
        } else if (nScreen == 1) {
        } else if (nScreen ==2) {
            setScreen(scrGameover);
        } else if (nScreen == 3){
        }
    }

    @Override
    public void create() {
        nScreen = 0;
        // notice that "this" is passed to each screen. Each screen now has access to methods within the "game" master program
        scrMenu = new ScrMenu(this);
        scrGameover = new ScrGameover(this);
        updateState(0);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    public static class menu {
        public static Object Screens;

        public menu() {
        }

        public static class Screens {

            public Screens() {
            }
        }
    }
}