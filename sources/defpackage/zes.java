package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zes implements zgg {
    private final List a;

    public zes(List list) {
        this.a = list;
    }

    @Override // defpackage.zgg
    public final String a(long j) {
        StringBuilder sb = new StringBuilder();
        for (zem zemVar : this.a) {
            if (sb.length() > 0) {
                sb.append(';');
            }
            if (zemVar.b() >= j) {
                sb.append((zemVar.b() - j) / 1000.0d);
            }
            sb.append('-');
            switch (zemVar.c().ordinal()) {
                case 0:
                    sb.append('a');
                    break;
                case 1:
                    sb.append('b');
                    break;
                case 2:
                    sb.append('c');
                    break;
                case 3:
                    sb.append('d');
                    break;
                case 4:
                    sb.append('e');
                    sb.append(zemVar.d().k);
                    sb.append('-');
                    if (zemVar.f() instanceof String) {
                        sb.append((String) zemVar.f());
                    }
                    break;
                case 5:
                    sb.append('f');
                    break;
                case 6:
                    sb.append('g');
                    sb.append(zemVar.a());
                    break;
                case 7:
                    sb.append("h-");
                    if (zemVar.f() instanceof String) {
                        sb.append((String) zemVar.f());
                    }
                    break;
                case 8:
                    sb.append('i');
                    break;
                case 9:
                    sb.append('j');
                    break;
                case 10:
                    sb.append('k');
                    break;
                case 11:
                    sb.append('l');
                    break;
                case 12:
                    sb.append('m');
                    break;
                case 13:
                    sb.append('n');
                    break;
                case 14:
                    sb.append('o');
                    break;
                case 15:
                    sb.append('p');
                    break;
                case 16:
                    sb.append('q');
                    break;
                case 17:
                    sb.append('r');
                    Object objF = zemVar.f();
                    if (objF instanceof cbo) {
                        sb.append((((cbo) objF).b - j) / 1000.0d);
                    }
                    break;
                case 18:
                    sb.append('s');
                    sb.append(zemVar.a());
                    break;
                case 19:
                    sb.append('t');
                    sb.append(zemVar.a());
                    break;
                case 20:
                    sb.append('u');
                    if (zemVar.f() instanceof String) {
                        sb.append((String) zemVar.f());
                    }
                    break;
                case 21:
                    sb.append('v');
                    break;
            }
            int iOrdinal = zemVar.e().ordinal();
            if (iOrdinal == 0) {
                sb.append('A');
            } else if (iOrdinal == 1) {
                sb.append('B');
            } else if (iOrdinal != 2) {
                sb.append('D');
            } else {
                sb.append('C');
            }
        }
        sb.insert(0, "e;");
        return sb.toString();
    }
}
