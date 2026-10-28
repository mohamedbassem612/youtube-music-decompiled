package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abab implements agaw {
    public static final Map a;
    public final abvn b;
    public final may c;

    static {
        HashMap map = new HashMap();
        map.put(abnr.DEFAULT, ashl.PLAYER_VISIBILITY_DEFAULT);
        map.put(abnr.MINIMIZED, ashl.PLAYER_VISIBILITY_MINIMIZED);
        map.put(abnr.FULLSCREEN, ashl.PLAYER_VISIBILITY_FULLSCREEN);
        map.put(abnr.BACKGROUND, ashl.PLAYER_VISIBILITY_BACKGROUND);
        map.put(abnr.REMOTE, ashl.PLAYER_VISIBILITY_REMOTE);
        map.put(abnr.INLINE_IN_FEED, ashl.PLAYER_VISIBILITY_INLINE);
        map.put(abnr.VIRTUAL_REALITY, ashl.PLAYER_VISIBILITY_VR);
        map.put(abnr.PICTURE_IN_PICTURE, ashl.PLAYER_VISIBILITY_PICTURE_IN_PICTURE);
        a = DesugarCollections.unmodifiableMap(map);
    }

    public abab(may mayVar, abvn abvnVar) {
        this.c = mayVar;
        this.b = abvnVar;
    }

    @Override // defpackage.agaw
    public final void a(mbb mbbVar) {
        mdu.b(this.b.D().H(new yrb(this, 11)), mbbVar);
    }

    @Override // defpackage.agaw
    public final void b(mbb mbbVar) {
        mdu.b(this.b.ao().b().H(new aalc(13)).p().H(new aalc(14)), mbbVar);
    }
}
