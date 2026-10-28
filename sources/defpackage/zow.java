package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zow {
    private final String a;
    private final int b;
    private final boolean c;

    public zow(String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public static /* synthetic */ int a(EditText editText) {
        if (TextUtils.isEmpty(editText.getHint())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = new Rect();
            editText.getPaint().getTextBounds(editText.getHint(), 0, editText.getHint().length(), rect);
            int iWidth = rect.width();
            int width = editText.getWidth();
            if (width != 0) {
                return (iWidth / width) + 1;
            }
        }
        return editText.getLineCount();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zow) {
            zow zowVar = (zow) obj;
            if (this.a.equals(zowVar.a) && this.b == zowVar.b && this.c == zowVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "FontKey{fontName=" + this.a + ", weight=" + this.b + ", italic=" + this.c + '}';
    }

    public zow() {
        throw null;
    }
}
