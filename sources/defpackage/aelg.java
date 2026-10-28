package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aelg implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aelg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            a((Throwable) obj);
        } else if (i != 1) {
            a((Throwable) obj);
        } else {
            a((Throwable) obj);
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((aelh) this.a).d(th);
            return;
        }
        if (i != 1) {
            ((agrc) ((agrc) ((agrc) aety.a.c().i(agso.a, "MA.UMC")).j(th.getCause())).k("com/google/android/libraries/youtube/watch/updatedmetadata/UpdatedMetadataController$MetadataUpdateHandler", "onError", (char) 387, "UpdatedMetadataController.java")).t("Could not load updated metadata");
            ((aett) this.a).b(30000L);
        } else {
            if (th instanceof CancellationException) {
                return;
            }
            Object obj = this.a;
            ((agrc) ((agrc) ((agrc) aejo.a.b()).j(th)).k("com/google/android/libraries/youtube/search/voice/EmbeddedAssistant", "pollAndStreamAudio", (char) 1049, "EmbeddedAssistant.java")).t("MEMFD: Read task execution failed");
            ((aejo) obj).O.set(false);
        }
    }
}
