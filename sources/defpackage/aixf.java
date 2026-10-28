package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aixf implements aihr {
    CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED(0),
    CONTROL_FLOW_MANAGER_LAYER_CORE(1),
    CONTROL_FLOW_MANAGER_LAYER_ADAPTER(2),
    CONTROL_FLOW_MANAGER_LAYER_SURFACE(3),
    CONTROL_FLOW_MANAGER_LAYER_EXTERNAL(4);

    public final int f;

    aixf(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
