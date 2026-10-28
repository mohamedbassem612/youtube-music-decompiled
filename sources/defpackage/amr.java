package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class amr {
    public static final int $stable = 8;
    private boolean isAttached;
    private anc layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final anc getLayoutCoordinates$androidx_compose_ui_ui() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m108getSizeYbymL2g() {
        anc ancVar = this.layoutCoordinates;
        if (ancVar != null) {
            return ancVar.g();
        }
        return 0L;
    }

    public final boolean isAttached$androidx_compose_ui_ui() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo109onPointerEventH0pRuoY(amp ampVar, amq amqVar, long j);

    public final void setAttached$androidx_compose_ui_ui(boolean z) {
        this.isAttached = z;
    }

    public final void setLayoutCoordinates$androidx_compose_ui_ui(anc ancVar) {
        this.layoutCoordinates = ancVar;
    }
}
