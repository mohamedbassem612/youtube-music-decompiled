package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejp {
    final vxz A;
    final abxv C;
    final wjr D;
    final qcb E;
    final qcb F;
    final ci G;
    final CronetEngine a;
    final rly b;
    final zwb c;
    final Executor d;
    final Handler e;
    final String f;
    final String i;
    final byte[] j;
    final mbc l;
    final ahey m;
    final String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String u;
    public aigj v;
    public aigj w;
    final int x;
    public int z;
    public float r = 0.7f;
    public agev s = agdf.a;
    public int y = 2;
    public String t = "embeddedassistant.googleapis.com";
    final lqa B = new lqa((byte[]) null, (short[]) null);
    final String g = "PLACEHOLDER";
    final String h = "PLACEHOLDER";
    final String k = "AIzaSyAOghZGza2MQSZkY_zfZ370N-PUdXEo8AI";

    public aejp(CronetEngine cronetEngine, rly rlyVar, abxv abxvVar, wjr wjrVar, zwb zwbVar, ci ciVar, Executor executor, Handler handler, String str, vxz vxzVar, mbc mbcVar, ahey aheyVar, qcb qcbVar, qcb qcbVar2, String str2, byte[] bArr, int i, String str3) {
        this.a = cronetEngine;
        this.b = rlyVar;
        this.C = abxvVar;
        this.D = wjrVar;
        this.c = zwbVar;
        this.G = ciVar;
        this.d = executor;
        this.e = handler;
        this.f = str;
        this.A = vxzVar;
        this.l = mbcVar;
        this.m = aheyVar;
        this.F = qcbVar;
        this.E = qcbVar2;
        this.i = str2;
        this.j = bArr;
        this.x = i;
        this.n = str3;
    }
}
