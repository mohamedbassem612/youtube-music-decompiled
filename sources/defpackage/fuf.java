package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fuf extends fue {
    private boolean n;
    private eol o;

    final void b() {
        if (this.n) {
            return;
        }
        c();
        this.n = true;
        setKeyListener(super.getKeyListener());
    }

    final eol c() {
        eol eolVar = this.o;
        if (eolVar != null) {
            return eolVar;
        }
        eol eolVar2 = new eol((EditText) this, (byte[]) null);
        this.o = eolVar2;
        return eolVar2;
    }

    @Override // defpackage.fue, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.n ? c().k(inputConnectionOnCreateInputConnection, editorInfo) : inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.n && keyListener != null) {
            c();
            keyListener = eol.l(keyListener);
        }
        super.setKeyListener(keyListener);
    }
}
