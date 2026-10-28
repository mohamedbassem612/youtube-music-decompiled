package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnv implements boe {
    private final bnu a;
    private final boe b;

    public bnv(bnu bnuVar, boe boeVar) {
        this.a = bnuVar;
        this.b = boeVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        switch (boaVar.ordinal()) {
            case 0:
                this.a.onCreate(bogVar);
                break;
            case 1:
                this.a.onStart(bogVar);
                break;
            case 2:
                this.a.onResume(bogVar);
                break;
            case 3:
                this.a.onPause(bogVar);
                break;
            case 4:
                this.a.onStop(bogVar);
                break;
            case 5:
                this.a.onDestroy(bogVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not be sent by anybody");
            default:
                throw new awmj();
        }
        boe boeVar = this.b;
        if (boeVar != null) {
            boeVar.a(bogVar, boaVar);
        }
    }
}
