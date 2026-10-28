package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class glv extends gll {
    private boolean a = false;

    public glv() {
        addOnContextAvailableListener(new gfa(this, 3));
    }

    @Override // defpackage.glw
    public final void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        componentManager().f();
    }
}
