package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hvb {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncTask");
    public final Context b;
    public final huw c;
    public final Integer d;
    public final Executor e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final ahbw i;
    public final aunn j;
    private final aany k;
    private final tbt l;
    private final aunn m;

    public hvb(huw huwVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, Context context, aany aanyVar, aunn aunnVar5, Integer num, Executor executor, tbt tbtVar, ahbw ahbwVar) {
        this.c = huwVar;
        this.m = aunnVar;
        this.f = aunnVar2;
        this.g = aunnVar3;
        this.h = aunnVar4;
        this.b = context;
        this.k = aanyVar;
        this.d = num;
        this.e = executor;
        this.l = tbtVar;
        this.i = ahbwVar;
        this.j = aunnVar5;
    }

    public final void a(aofh aofhVar, agke agkeVar) {
        aunn aunnVar = this.m;
        aajg.b(aofhVar, agkeVar, this.k.a(aofhVar), this.l, ((aanb) aunnVar.io()).b(), 28);
    }
}
