package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umh {
    public static final agkj a;
    public static final agkj b;
    public static final agkj c;
    public static final agkj d;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(auir.YOUTUBE_SANS, auir.CLASSIC_INTER_TIGHT);
        agkhVar.e(auir.LIGHT, auir.LIGHT_INTER_TIGHT);
        agkhVar.e(auir.HEAVY, auir.MARKER);
        agkhVar.e(auir.HANDWRITING, auir.SCRIPT);
        agkhVar.e(auir.TYPEWRITER, auir.PRINTER);
        agkhVar.e(auir.MEME, auir.NARROW);
        agkhVar.e(auir.FUN, auir.COZY);
        agkhVar.e(auir.CLASSY, auir.JOURNAL);
        agkj agkjVarD = agkhVar.d(true);
        a = agkjVarD;
        agkh agkhVar2 = new agkh(4);
        agkhVar2.e(auir.CLASSIC_INTER_TIGHT, auir.YOUTUBE_SANS);
        agkhVar2.e(auir.LIGHT_INTER_TIGHT, auir.LIGHT);
        agkhVar2.e(auir.MARKER, auir.HEAVY);
        agkhVar2.e(auir.SCRIPT, auir.HANDWRITING);
        agkhVar2.e(auir.PRINTER, auir.TYPEWRITER);
        agkhVar2.e(auir.NARROW, auir.MEME);
        agkhVar2.e(auir.COZY, auir.FUN);
        agkhVar2.e(auir.JOURNAL, auir.CLASSY);
        agkhVar2.e(auir.CHISEL, auir.YOUTUBE_SANS);
        agkj agkjVarD2 = agkhVar2.d(true);
        b = agkjVarD2;
        c = b(agkjVarD);
        d = b(agkjVarD2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static final umg a(int i, xpl xplVar, boolean z) {
        if (z) {
            if (i != 0) {
                return (umg) xplVar.b.get(Integer.valueOf(i | (-16777216)));
            }
        } else if (i != 0) {
            return (umg) xplVar.a.get(Integer.valueOf(i | (-16777216)));
        }
        return null;
    }

    private static final agkj b(Map map) {
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(((auir) entry.getKey()).name(), ((auir) entry.getValue()).name());
        }
        return agkhVar.d(true);
    }
}
