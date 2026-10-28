package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xxs implements xyf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ String a;
    final /* synthetic */ xxx b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public xxs(xxx xxxVar, String str, Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = xxxVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [abvc, java.lang.Object] */
    @Override // defpackage.xyf
    public final void a() {
        if (this.$cid != 0) {
            agrx agrxVar = agso.a;
            this.d.g((abnl) this.c);
            return;
        }
        ((agrc) ((agrc) xxx.a.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue$2", "onErrorResponse", 1378, "MdxPlaybackQueue.java")).t("onErrorResponse | Failed to fetch RQ playlist.");
        xxx xxxVar = this.b;
        xxxVar.d = false;
        Optional optional = xxxVar.c;
        optional.isPresent();
        ((awku) optional.get()).kk(Boolean.FALSE);
        if (xxxVar.I()) {
            String strS = xxx.s(xxxVar.e, ((xyv) this.d).b);
            xxxVar.e = "";
            if (strS != null) {
                xxxVar.x(strS, "");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [abvc, java.lang.Object] */
    @Override // defpackage.xyf
    public final void b(List list) {
        if (this.$cid != 0) {
            if (!list.isEmpty()) {
                xxx xxxVar = this.b;
                xxxVar.F(list);
                xxxVar.E(this.a);
            }
            if (this.a.equals(((abvk) this.b.b.io()).n())) {
                return;
            }
            agrx agrxVar = agso.a;
            this.d.g((abnl) this.c);
            return;
        }
        String str = this.a;
        xxx xxxVar2 = this.b;
        if (str.equals(xxxVar2.g)) {
            Object obj = this.c;
            xxxVar2.F(list);
            agrx agrxVar2 = agso.a;
            xye xyeVar = (xye) obj;
            xyv xyvVar = xyeVar.a;
            String str2 = xyvVar.g;
            if (!str2.equals(((abvk) xxxVar2.b.io()).m())) {
                String str3 = xyvVar.b;
                ahno.F(!TextUtils.isEmpty(str2));
                ahno.F(!TextUtils.isEmpty(str3));
                xxxVar2.w(str3, str2, xxxVar2.I() || xyeVar.b);
            } else if (xxxVar2.I() && xxxVar2.hd() == -1) {
                String str4 = xyvVar.b;
                if (!TextUtils.isEmpty(str4)) {
                    xxxVar2.E(str4);
                }
            }
            xxxVar2.d = false;
            Optional optional = xxxVar2.c;
            optional.isPresent();
            ((awku) optional.get()).kk(Boolean.FALSE);
            if (xxxVar2.H() && xxxVar2.f) {
                ((agrc) ((agrc) xxx.a.c().i(agrxVar2, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "onPostSyncDown", 1431, "MdxPlaybackQueue.java")).t("onPostSyncDown | resync required, fetching RQ playlist again.");
                xxxVar2.f = false;
                xxxVar2.D();
            } else {
                if (TextUtils.isEmpty(xxxVar2.e)) {
                    return;
                }
                xxxVar2.w(xxxVar2.e, str2, xxxVar2.I() || xyeVar.b);
                xxxVar2.e = "";
            }
        }
    }
}
