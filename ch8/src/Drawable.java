
public interface Drawable {
	int PLAIN_PEN = 1;
	int BOLD_PEN = 2;
	int ITALIC_PEN = 3;
	/*abstract public */ void draw();
	void move(int x, int y);

	}
