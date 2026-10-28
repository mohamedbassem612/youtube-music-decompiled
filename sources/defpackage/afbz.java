package defpackage;

import android.widget.Toast;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afbz implements Runnable {
    private final /* synthetic */ int $cid;
    int a = -1;
    final /* synthetic */ Object b;

    public afbz(afcd afcdVar, int i) {
        this.$cid = i;
        this.b = afcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        int i2 = this.a;
        if (i == 0) {
            ((afcd) this.b).c.sendEventForVirtualView(i2, 4);
            return;
        }
        int i3 = i2 + 1;
        if (i3 >= 3) {
            Toast.makeText(((rom) this.b).a, "Authentication Failed", 0).show();
            return;
        }
        this.a = i3;
        rom romVar = (rom) this.b;
        if (romVar.d.isStateSaved()) {
            romVar.c.postDelayed(this, 300L);
        } else {
            romVar.b.j(1);
        }
    }

    public afbz(rom romVar, int i) {
        this.$cid = i;
        this.b = romVar;
    }
}
