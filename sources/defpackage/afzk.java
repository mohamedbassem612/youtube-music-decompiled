package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afzk implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ afzk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return (alik) obj;
            case 1:
                return (aigv) obj;
            case 2:
                return (asdy) obj;
            case 3:
                return (asdw) obj;
            case 4:
                return (asfv) obj;
            case 5:
                return (asgg) obj;
            case 6:
                return (ashc) obj;
            case 7:
                return (asfw) obj;
            case 8:
                return (ashf) obj;
            case 9:
                return (asgz) obj;
            case 10:
                return (asga) obj;
            case 11:
                return (asgx) obj;
            case 12:
                return (asge) obj;
            case 13:
                return (asgk) obj;
            case 14:
                return (asfy) obj;
            case 15:
                return (ashm) obj;
            case 16:
                return (asib) obj;
            case 17:
                return (aspa) obj;
            case 18:
                return (asud) obj;
            case 19:
                String str = (String) obj;
                if (ahbi.a.l(str) && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\\') {
                        sb.append('\\');
                    } else if (cCharAt == '\"') {
                        cCharAt = '\"';
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            default:
                Collection collection = (Collection) obj;
                if (collection instanceof agku) {
                    agku agkuVar = (agku) collection;
                    agkuVar.l();
                    return agkuVar;
                }
                agkr agkrVar = new agkr(collection instanceof agow ? ((agow) collection).i().size() : 11);
                agkrVar.b(collection);
                return agkrVar.a();
        }
    }
}
