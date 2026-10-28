package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jly implements TextView.OnEditorActionListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jly(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.$cid;
        if (i2 == 0) {
            jmg jmgVar = (jmg) this.a;
            jmgVar.u();
            jmgVar.s();
            return true;
        }
        if (i2 == 1) {
            String string = textView.getText().toString();
            if (TextUtils.getTrimmedLength(string) <= 0) {
                return true;
            }
            ioc iocVar = (ioc) this.a;
            iocVar.z.h = 13;
            iocVar.h(string, -1, null);
            return true;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i == 4 || (keyEvent != null && keyEvent.getAction() == 0)) {
                    ((xbf) this.a).J();
                    return true;
                }
            } else if (i == 6) {
                vgu vguVar = (vgu) this.a;
                tuk.i(vguVar.c);
                vguVar.l();
                return true;
            }
        } else if (i == 6) {
            upo upoVar = (upo) this.a;
            if ((upoVar.p() && !upoVar.d.isEnabled()) || !upo.o(textView.getText())) {
                return true;
            }
            upoVar.m(Optional.empty());
            return true;
        }
        return false;
    }

    public jly(xbf xbfVar, int i) {
        this.$cid = i;
        this.a = xbfVar;
    }
}
