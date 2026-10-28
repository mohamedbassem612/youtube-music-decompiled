package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gdz extends ged {
    private boolean a = false;

    public gdz() {
        addOnContextAvailableListener(new fw((fx) this, 3));
    }

    @Override // defpackage.gea
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        componentManager().f();
    }
}
