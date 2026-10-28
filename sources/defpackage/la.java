package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class la extends avr {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ le d;

    public la(le leVar, int i, int i2, WeakReference weakReference) {
        this.d = leVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.avr
    public final void b(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        le leVar = this.d;
        WeakReference weakReference = this.c;
        if (leVar.c) {
            leVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new qd(textView, typeface, leVar.a, 1));
                } else {
                    le.f(textView, typeface, leVar.a);
                }
            }
        }
    }

    @Override // defpackage.avr
    public final void a(int i) {
    }
}
