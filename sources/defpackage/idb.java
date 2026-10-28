package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idb extends idd {
    private final boolean a;
    private final boolean b;
    private final ieg c;
    private final wgi d;
    private final boolean e;

    public idb(boolean z, boolean z2, ieg iegVar, wgi wgiVar, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = iegVar;
        this.d = wgiVar;
        this.e = z3;
    }

    @Override // defpackage.idd
    public final ieg a() {
        return this.c;
    }

    @Override // defpackage.idd
    public final wgi b() {
        return this.d;
    }

    @Override // defpackage.idd
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.idd
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.idd
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ieg iegVar;
        wgi wgiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof idd) {
            idd iddVar = (idd) obj;
            if (this.a == iddVar.d() && this.b == iddVar.e() && ((iegVar = this.c) != null ? iegVar.equals(iddVar.a()) : iddVar.a() == null) && ((wgiVar = this.d) != null ? wgiVar.equals(iddVar.b()) : iddVar.b() == null) && this.e == iddVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ieg iegVar = this.c;
        int iHashCode = (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (iegVar == null ? 0 : iegVar.hashCode());
        wgi wgiVar = this.d;
        return (((iHashCode * 1000003) ^ (wgiVar != null ? wgiVar.hashCode() : 0)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        wgi wgiVar = this.d;
        return "QueueRestorationEvent{isRestoring=" + this.a + ", skippedRestoration=" + this.b + ", localState=" + String.valueOf(this.c) + ", serverResponse=" + String.valueOf(wgiVar) + ", enableEmptyServerQueueRestorationHandling=" + this.e + '}';
    }
}
