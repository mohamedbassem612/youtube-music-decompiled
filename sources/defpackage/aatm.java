package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatm implements aatq {
    private final mbc a;
    private final txp b;
    private final wjb c;
    private final aatr d;
    private final Key e;
    private final zgy f;
    private final zgy g;
    private final zgm h;
    private final aauk i;
    private final yoz j;
    private final zjr k;
    private final awmd l;
    private final abxv m;
    private final aazo n;

    public aatm(mbc mbcVar, txp txpVar, wjb wjbVar, aatr aatrVar, dov dovVar, SharedPreferences sharedPreferences, zgy zgyVar, zgy zgyVar2, abxv abxvVar, zgm zgmVar, aauk aaukVar, yoz yozVar, aazo aazoVar, zjr zjrVar, awmd awmdVar) {
        this.a = mbcVar;
        this.b = txpVar;
        this.c = wjbVar;
        this.d = aatrVar;
        this.e = dovVar.ai(sharedPreferences);
        this.f = zgyVar;
        this.m = abxvVar;
        this.h = zgmVar;
        this.i = aaukVar;
        this.j = yozVar;
        this.n = aazoVar;
        this.k = zjrVar;
        this.g = zgyVar2;
        this.l = awmdVar;
    }

    @Override // defpackage.aatq
    public final aarw a(aamw aamwVar, aarv aarvVar, aatj aatjVar, aaqn aaqnVar) {
        Key key = this.e;
        aatjVar.b = key;
        aatjVar.c = key;
        aatjVar.d = aatjVar.e ? this.g : this.f;
        return new aatn(aarvVar, aaqnVar, this.c, this.a, this.b, aamwVar, new grj(aatjVar), this.d, this.m, this.h, this.i, this.j, this.n, this.k, this.l);
    }
}
