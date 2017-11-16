package assaf.zfani.custumview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by user on 11/16/2017.
 */

public class TextViewDraw extends AppCompatTextView {
    public TextViewDraw(Context context) {
        super(context);
    }

    public TextViewDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(4);
        paint.setColor(Color.BLACK);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(canvas.getWidth(),0,0,canvas.getHeight(),paint);

    }
}
