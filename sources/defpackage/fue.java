package defpackage;

import android.content.Context;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class fue extends EditText implements TextView.OnEditorActionListener {
    public fip a;
    public fip b;
    public fip c;
    public fip d;
    public fip e;
    public fip f;
    public fip g;
    public List h;
    public fip i;
    public fhd j;
    public AtomicReference k;
    public TextWatcher l;
    public boolean m;
    private int n;

    public fue(Context context) {
        super(context);
        this.n = -1;
        this.m = false;
        setOnEditorActionListener(this);
    }

    final void a(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            if (!z) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                this.m = false;
            } else if (inputMethodManager.isActive(this)) {
                inputMethodManager.showSoftInput(this, 0);
                this.m = false;
            } else {
                post(new fuc(this, inputMethodManager, 0));
                this.m = true;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        List list = this.h;
        if (list == null || list.isEmpty()) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = (String[]) this.h.toArray(new String[0]);
        return bco.a(inputConnectionOnCreateInputConnection, editorInfo, new fub(this, 0));
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        fip fipVar = this.f;
        if (fipVar == null) {
            return false;
        }
        int i2 = fua.R;
        acu acuVar = new acu();
        acuVar.a = textView;
        return ((Boolean) fipVar.b.n().z(fipVar, acuVar)).booleanValue();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.n = getLineCount();
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        fhd fhdVar;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.k;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        fip fipVar = this.a;
        if (fipVar != null) {
            String string = charSequence.toString();
            int i4 = fua.R;
            isw iswVar = new isw();
            iswVar.b = this;
            iswVar.a = string;
            fipVar.b.n().z(fipVar, iswVar);
        }
        int lineCount = getLineCount();
        int i5 = this.n;
        if (i5 == -1 || i5 == lineCount || (fhdVar = this.j) == null) {
            return;
        }
        fua.aF(fhdVar);
    }
}
