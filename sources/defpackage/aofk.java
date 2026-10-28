package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofk implements weh {
    static final aofj a;
    public static final weq b;
    public final aofl c;

    static {
        aofj aofjVar = new aofj();
        a = aofjVar;
        b = aofjVar;
    }

    public aofk(aofl aoflVar) {
        this.c = aoflVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aofi(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aofk) && this.c.equals(((aofk) obj).c);
    }

    public aofh getActionProto() {
        aofh aofhVar = this.c.f;
        return aofhVar == null ? aofh.a : aofhVar;
    }

    public List getChildActionIds() {
        return this.c.i;
    }

    public Long getEnqueueTimeNs() {
        aofl aoflVar = this.c;
        return Long.valueOf(aoflVar.c == 11 ? ((Long) aoflVar.d).longValue() : 0L);
    }

    public Long getEnqueueTimeSec() {
        aofl aoflVar = this.c;
        return Long.valueOf(aoflVar.c == 3 ? ((Long) aoflVar.d).longValue() : 0L);
    }

    public Boolean getHasChildActionFailed() {
        return Boolean.valueOf(this.c.m);
    }

    public String getParentActionId() {
        return this.c.h;
    }

    public List getPostreqActionIds() {
        return this.c.k;
    }

    public String getPrereqActionId() {
        return this.c.j;
    }

    public Integer getRetryScheduleIndex() {
        return Integer.valueOf(this.c.l);
    }

    public String getRootActionId() {
        return this.c.g;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "OfflineOrchestrationActionWrapperEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
