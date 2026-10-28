package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ron implements TextView.OnEditorActionListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ron(admr admrVar, Object obj, int i) {
        this.$cid = i;
        this.a = admrVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, nry] */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = zpk.a;
                Object obj = this.b;
                if (obj == null) {
                    return false;
                }
                this.a.a((CommandOuterClass$Command) obj, zpk.d((zoz) textView)).D();
            } else {
                if (i != 6) {
                    return false;
                }
                Object obj2 = this.b;
                roe roeVar = (roe) this.a;
                roeVar.i((xgj) obj2);
                roeVar.g();
            }
        } else {
            if (i != 6) {
                return false;
            }
            ((rop) this.a).i((tld) this.b);
        }
        return true;
    }

    public /* synthetic */ ron(CommandOuterClass$Command commandOuterClass$Command, nry nryVar, int i) {
        this.$cid = i;
        this.b = commandOuterClass$Command;
        this.a = nryVar;
    }
}
