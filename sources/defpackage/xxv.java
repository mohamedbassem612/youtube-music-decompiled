package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xxv extends zik {
    final /* synthetic */ xxx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxv(xxx xxxVar) {
        super((byte[]) null);
        this.a = xxxVar;
    }

    @Override // defpackage.zik
    public final void gW(String str) {
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) xxx.a.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue$MdxQueueSessionListener", "onMdxAutonavUpNext", 1521, "MdxPlaybackQueue.java")).t("Trying to sync down empty Autonav videoId. Discarding request.");
            return;
        }
        xxx xxxVar = this.a;
        xxxVar.h.g(str, new xxu(xxxVar.k));
    }

    @Override // defpackage.zik
    public final void ju(int i) {
        if (i == 1 || i == 3) {
            abjl abjlVar = this.a.k;
            abjlVar.hi(1, 0, abjlVar.hc(1));
        }
    }
}
