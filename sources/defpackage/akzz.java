package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzz implements weh {
    static final akzy a;
    public static final weq b;
    public final alab c;

    static {
        akzy akzyVar = new akzy();
        a = akzyVar;
        b = akzyVar;
    }

    public akzz(alab alabVar) {
        this.c = alabVar;
    }

    public static akzx e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) alab.a.createBuilder();
        aihhVar.copyOnWrite();
        alab alabVar = (alab) aihhVar.instance;
        alabVar.b |= 1;
        alabVar.c = str;
        return new akzx(aihhVar);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new akzx((aihh) this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akzz) && this.c.equals(((akzz) obj).c);
    }

    public String getCurrentStepId() {
        return this.c.d;
    }

    public Boolean getDisableFlowContinuation() {
        return Boolean.valueOf(this.c.g);
    }

    public alaa getDynamicCommands() {
        alaa alaaVar = this.c.k;
        return alaaVar == null ? alaa.a : alaaVar;
    }

    public Boolean getIsLoading() {
        return Boolean.valueOf(this.c.i);
    }

    public Map getNextStepIdOverrideMap() {
        return DesugarCollections.unmodifiableMap(this.c.f);
    }

    public Boolean getPrimaryButtonDisabled() {
        return Boolean.valueOf(this.c.h);
    }

    public List getStepIdStack() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "FlowStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
