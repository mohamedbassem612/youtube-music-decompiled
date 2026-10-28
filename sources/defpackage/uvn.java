package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/proto/PrimaryContentMixins");

    public static agke a(auhs auhsVar, Set set) {
        Uri uriFX;
        if (set.isEmpty()) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        agke agkeVarB = b(auhsVar);
        int size = agkeVarB.size();
        for (int i = 0; i < size; i++) {
            augy augyVar = (augy) agkeVarB.get(i);
            if (yno.gd(augyVar) && (uriFX = yno.fX(augyVar)) != null && set.contains(uriFX)) {
                agjzVar.h(augyVar);
            }
        }
        return agjzVar.g();
    }

    public static agke b(auhs auhsVar) {
        aufx aufxVar = (aufx) yno.gx(auhsVar, aufx.b);
        agkx agkxVarI = agkz.i(aufxVar.c.size() << 1);
        for (aufw aufwVar : aufxVar.c) {
            if ((aufwVar.b & 1) != 0) {
                agkxVarI.c(Long.valueOf(aufwVar.c));
            }
            if ((aufwVar.b & 2) != 0) {
                agkxVarI.c(Long.valueOf(aufwVar.d));
            }
        }
        return (agke) Collection.EL.stream(auhsVar.d).filter(new uso(agkxVarI.g(), 8)).collect(aghu.a);
    }

    public static agkz c(auhs auhsVar) {
        Uri uriFX;
        agkx agkxVar = new agkx();
        agke agkeVarB = b(auhsVar);
        int size = agkeVarB.size();
        for (int i = 0; i < size; i++) {
            augy augyVar = (augy) agkeVarB.get(i);
            if (yno.gd(augyVar) && (uriFX = yno.fX(augyVar)) != null) {
                agkxVar.c(uriFX);
            }
        }
        return agkxVar.g();
    }

    public static ListenableFuture d(Context context, Set set, File file, Executor executor) {
        return ahno.ap(new ium(set, context, file, 17, (byte[]) null), executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static auhs e(auhs auhsVar, Context context) {
        urs ursVar = new urs(auhsVar);
        agke agkeVarF = usj.f(auhsVar);
        Stream streamFilter = Collection.EL.stream(agkeVarF).filter(new uvm(0));
        Collector collector = aghu.a;
        agke agkeVar = (agke) streamFilter.collect(collector);
        agke agkeVar2 = (agke) Collection.EL.stream(agkeVarF).filter(new sde(20)).collect(collector);
        int i = 1;
        try {
            agqs agqsVarListIterator = agkeVar.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                ursVar.b(new utn(ursVar.a(), (augy) agqsVarListIterator.next(), context.getString(R.string.shorts_editor_missing_media_text), tzk.n(context, R.attr.ytStaticBrandWhite).orElse(-1)).a(auhsVar));
            }
            agqs agqsVarListIterator2 = agkeVar2.listIterator(0);
            while (agqsVarListIterator2.hasNext()) {
                ursVar.b(new utn(ursVar.a(), (augy) agqsVarListIterator2.next(), context.getString(R.string.shorts_editor_unsupported_media_text), tzk.n(context, R.attr.ytStaticBrandWhite).orElse(-1)).a(auhsVar));
            }
        } catch (utw e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/proto/PrimaryContentMixins", "maybeAddPlaybackInfoContent", (char) 476, "PrimaryContentMixins.java")).t("Failed adding playback info segment.");
        }
        if (Collection.EL.stream(agkeVarF).anyMatch(new uvm(i))) {
            ursVar.b(new uum(tzk.n(context, R.attr.ytStaticGrey).orElse(-7829368)));
        }
        return ursVar.b;
    }

    public static auhs f(Context context, auhs auhsVar, agke agkeVar) {
        agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).map(new ush(12)).collect(aghu.a);
        urs ursVar = new urs(auhsVar);
        int size = agkeVar.size();
        int i = 0;
        while (i < size) {
            utw utwVarB = ursVar.b(new uty(((augy) agkeVar.get(i)).e, 1).a(auhsVar));
            i++;
            if (utwVarB != null) {
                throw utwVarB;
            }
        }
        int size2 = agkeVar2.size();
        int i2 = 0;
        while (i2 < size2) {
            utw utwVarB2 = ursVar.b(utr.d(context, (augy) agkeVar2.get(i2), Optional.empty(), false, false));
            i2++;
            if (utwVarB2 != null) {
                throw utwVarB2;
            }
        }
        return e(ursVar.b, context);
    }
}
