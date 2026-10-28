package defpackage;

import android.os.Build;
import android.widget.Toast;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rkk extends vy {
    final /* synthetic */ rom a;
    final /* synthetic */ snu b;

    public rkk(snu snuVar, rom romVar) {
        this.a = romVar;
        this.b = snuVar;
    }

    @Override // defpackage.vy
    public final void d(int i, CharSequence charSequence) {
        if (i == 10) {
            ((rnj) ((tld) this.b.b).a).a(9, null);
        } else {
            snu snuVar = this.b;
            if (i == 5) {
                ((rnj) ((tld) snuVar.b).a).a(10, null);
            } else {
                ((rnj) ((tld) snuVar.b).a).a(8, Integer.valueOf(i));
            }
        }
        Toast.makeText(this.a.a, charSequence, 0).show();
    }

    @Override // defpackage.vy
    public final void e() {
        ((rnj) ((tld) this.b.b).a).a(7, null);
        Toast.makeText(this.a.a, "Authentication Failed", 0).show();
    }

    @Override // defpackage.vy
    public final void f() {
        ((rnj) ((tld) this.b.b).a).a(6, null);
        int i = Build.VERSION.SDK_INT;
        rom romVar = this.a;
        if (i >= 29) {
            romVar.b.j(1);
        } else {
            romVar.c.postDelayed(new afbz(romVar, 1), 100L);
        }
    }
}
