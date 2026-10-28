package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpm implements tpq {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/common/preferences/JetpackDataStoreSettingsStore");
    public final awkv a;
    private final MessageLite c;
    private final avlh d;
    private final ayq e;

    public tpm(ayq ayqVar, MessageLite messageLite) {
        this.e = ayqVar;
        this.c = messageLite;
        awkv awkvVarAI = new awku().aI();
        this.a = awkvVarAI;
        awgn awgnVar = new awgn(new tzh(ayqVar.i()));
        avnn avnnVar = atqp.o;
        this.d = awgnVar.g().Q(messageLite).k(awkvVarAI).p();
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        return this.e.i();
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(final agek agekVar) {
        return afxd.f(this.e.j(new axp() { // from class: tpl
            @Override // defpackage.axp
            public final Object a(Object obj) {
                return (MessageLite) agekVar.apply((MessageLite) obj);
            }
        })).g(new olh(this, 18), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tpq
    public final MessageLite c() {
        try {
            return (MessageLite) taf.b(this.e.i(), new sdp(3));
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) b.c()).j(e)).k("com/google/android/libraries/youtube/common/preferences/JetpackDataStoreSettingsStore", "blockAndGetData", '@', "JetpackDataStoreSettingsStore.java")).t("Failed to read from the store. Falling back to default instance");
            return this.c;
        }
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.d;
    }
}
