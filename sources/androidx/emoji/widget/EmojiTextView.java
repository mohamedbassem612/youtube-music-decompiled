package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import defpackage.azw;
import defpackage.blx;
import defpackage.eol;
import defpackage.zf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class EmojiTextView extends TextView {
    private boolean a;
    private zf b;

    public EmojiTextView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((eol) b().a).j();
    }

    private final zf b() {
        zf zfVar = this.b;
        if (zfVar != null) {
            return zfVar;
        }
        zf zfVar2 = new zf((TextView) this);
        this.b = zfVar2;
        return zfVar2;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        Object obj = b().a;
        if (z) {
            ((eol) obj).j();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        Object obj = b().a;
        int length = inputFilterArr.length;
        for (Object[] objArr : inputFilterArr) {
            if (objArr instanceof blx) {
                super.setFilters(inputFilterArr);
            }
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
        inputFilterArr2[length] = ((eol) obj).b;
        inputFilterArr = inputFilterArr2;
        super.setFilters(inputFilterArr);
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
