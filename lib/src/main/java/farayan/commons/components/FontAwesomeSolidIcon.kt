package farayan.commons.components

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.core.content.res.ResourcesCompat
import farayan.commons.components.font.icon.awesome.solid.R
import java.lang.Exception

class FontAwesomeSolidIcon : FixedResourceFontTextView {

    constructor(@androidx.annotation.NonNull context: Context) : super(context)
    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?) : super(context, attrs) {
        loadAttrs(attrs)
    }

    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        loadAttrs(attrs, defStyleAttr)
    }


    private fun loadAttrs(attrs: AttributeSet?, defStyleAttr: Int = 0) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FontAwesomeSolidIcon, defStyleAttr, 0)
        try {
            val textCode = typedArray.getInt(R.styleable.FontAwesomeSolidIcon_SolidIcon, 0);
            text = textCode.toChar().toString();
        } finally {
            typedArray.recycle();
        }
    }

    override val inheritedFontResID: Int
        get() = R.font.font_awesome_5_free_solid_900
}
