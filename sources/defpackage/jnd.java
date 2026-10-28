package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnd {
    public final /* synthetic */ Object a;

    public jnd(Object obj) {
        this.a = obj;
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        if (aboeVar.j != 15) {
            acda acdaVar = (acda) this.a;
            acdaVar.d = aboeVar;
            acdaVar.g();
        }
    }

    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        if (aaywVar.b != abnw.c) {
            acda acdaVar = (acda) this.a;
            acdaVar.d = null;
            acdaVar.g();
        }
    }

    @tcc
    public void handleYouTubePlayerStateEvent(aazn aaznVar) {
        if (aaznVar.a != 8) {
            acda acdaVar = (acda) this.a;
            acdaVar.d = null;
            acdaVar.g();
        }
    }
}
