package defpackage;

import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper;
import java.security.Key;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yho {
    public yfp a = new ygc();
    private final agfr b;
    private final Key c;
    private final ahey d;
    private final zjr e;
    private final zjx f;
    private final xeu g;
    private final yhl h;
    private final abxv i;

    public yho(agfr agfrVar, Key key, ahey aheyVar, zjr zjrVar, xeu xeuVar, abxv abxvVar, zjx zjxVar) {
        this.b = agfrVar;
        this.c = key;
        this.d = aheyVar;
        this.e = zjrVar;
        this.g = xeuVar;
        this.i = abxvVar;
        this.f = zjxVar;
        zjrVar.getClass();
        this.h = new yhl(new yhn(zjrVar, 0));
    }

    public final yhq a(String str, ywn ywnVar, PlaybackControllerWrapper playbackControllerWrapper) {
        agfr agfrVar = this.b;
        zjr zjrVar = this.e;
        ablj abljVar = new ablj(agfrVar, zjrVar);
        Key key = this.c;
        yhs yhsVar = new yhs(abljVar, zjrVar, key, this.f);
        yfg yfgVar = yfg.a;
        yhl yhlVar = this.h;
        return new yhq(abljVar, key, this.d, zjrVar, this.g, this.i, playbackControllerWrapper, str, ywnVar, yhlVar, yhsVar, yfgVar);
    }

    public final yhu b(String str, ywn ywnVar, PlaybackControllerWrapper playbackControllerWrapper) {
        yfp yfpVar = this.a;
        Key key = this.c;
        zjx zjxVar = this.f;
        zjr zjrVar = this.e;
        yhs yhsVar = new yhs(yfpVar, zjrVar, key, zjxVar);
        return new yhu(yfpVar, this.d, zjrVar, this.g, this.i, playbackControllerWrapper, str, ywnVar, yhsVar);
    }
}
