package com.vogella.android.view.compoundview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ColorOptionsView extends View {

	private View mValue;
	private ImageView mImage;

	public ColorOptionsView(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray a = context.obtainStyledAttributes(attrs,
				R.styleable.Options, 0, 0);
		String titleText = a.getString(R.styleable.Options_titleText);
		int valueColor = a.getColor(R.styleable.Options_valueColor,
				android.R.color.holo_blue_light);
		a.recycle();

		// more stuff
	}


}
