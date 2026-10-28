package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class yuf {
    private static final String d(List list, awqg awqgVar) {
        return list.isEmpty() ? "" : atqq.aD(list, ".", ".", null, new yrc(awqgVar, 6), 28);
    }

    public abstract yty a(List list);

    public abstract agke b();

    public final void c(ywn ywnVar, agke agkeVar, yty ytyVar) {
        String str;
        ywnVar.getClass();
        agkeVar.getClass();
        if (ytyVar == null) {
            int i = yno.i(this);
            if (i == 0) {
                str = "er";
            } else if (i == 1) {
                str = "ey";
            } else {
                if (i != 2) {
                    throw new awmj();
                }
                str = "eo";
            }
        } else {
            int i2 = yno.i(this);
            if (i2 == 0) {
                str = "r";
            } else if (i2 == 1) {
                str = "y";
            } else {
                if (i2 != 2) {
                    throw new awmj();
                }
                str = ytyVar.a ? "apf" : "aps";
            }
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(";p.s" + ((agpi) b()).d);
        sb.append(d(b(), yuc.a));
        sb.append(";cq.s" + ((agpi) agkeVar).d);
        sb.append(d(agkeVar, new awrf() { // from class: yud
            @Override // defpackage.awrf
            public final Object a(Object obj) {
                return ((zev) obj).b;
            }
        }));
        sb.append(";v2q.");
        if (ytyVar == null) {
            sb.append("null");
        } else {
            agke agkeVar2 = ytyVar.b;
            int size = agkeVar2.size();
            StringBuilder sb2 = new StringBuilder("rcq.");
            sb2.append(true != ytyVar.a ? "0" : "1");
            sb2.append(".s");
            sb2.append(size);
            sb.append(sb2.toString());
            sb.append(d(agkeVar2, yue.a));
            Integer num = ytyVar.c;
            if (num != null) {
                sb.append(";i" + num + '.' + ytyVar.d);
            }
        }
        ywnVar.w("qvsdbg", sb.toString());
    }
}
