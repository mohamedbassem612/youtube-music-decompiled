package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class qra {
    static {
        aihf aihfVarCreateBuilder = atym.a.createBuilder();
        atyg atygVar = atyg.a;
        aihfVarCreateBuilder.copyOnWrite();
        atym atymVar = (atym) aihfVarCreateBuilder.instance;
        atygVar.getClass();
        atymVar.c = atygVar;
        atymVar.b = 1;
        aihf aihfVarCreateBuilder2 = atym.a.createBuilder();
        atyk atykVar = atyk.a;
        aihfVarCreateBuilder2.copyOnWrite();
        atym atymVar2 = (atym) aihfVarCreateBuilder2.instance;
        atykVar.getClass();
        atymVar2.c = atykVar;
        atymVar2.b = 2;
        aihf aihfVarCreateBuilder3 = atym.a.createBuilder();
        atyl atylVar = atyl.a;
        aihfVarCreateBuilder3.copyOnWrite();
        atym atymVar3 = (atym) aihfVarCreateBuilder3.instance;
        atylVar.getClass();
        atymVar3.c = atylVar;
        atymVar3.b = 3;
    }

    public static String a(atyn atynVar) {
        int i;
        String strConcat;
        agjz agjzVar = new agjz(4);
        for (atym atymVar : atynVar.b) {
            int i2 = atymVar.b;
            switch (i2) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            if (i3 == 0) {
                strConcat = "compress";
            } else if (i3 != 1) {
                String str = "";
                if (i3 == 2) {
                    atyl atylVar = i2 == 3 ? (atyl) atymVar.c : atyl.a;
                    int i4 = atylVar.b;
                    strConcat = i4 == 1 ? "integrity(sha256=" + b(i4 == 1 ? (String) atylVar.c : "") + ')' : "integrity";
                } else if (i3 == 3) {
                    atyo atyoVar = i2 == 4 ? (atyo) atymVar.c : atyo.a;
                    ahno.F(1 == (atyoVar.b & 1));
                    strConcat = "zip(target=" + b(atyoVar.c) + ')';
                } else if (i3 == 4) {
                    atyi atyiVar = i2 == 5 ? (atyi) atymVar.c : atyi.a;
                    if (atyiVar.c.size() > 0) {
                        agjz agjzVar2 = new agjz(4);
                        for (atyh atyhVar : atyiVar.c) {
                            ahno.F(1 == (atyhVar.b & 1));
                            if ((atyhVar.b & 2) != 0) {
                                agjzVar2.h(atyhVar.c + '=' + b(atyhVar.d));
                            } else {
                                agjzVar2.h(atyhVar.c);
                            }
                        }
                        str = "(" + new ager(",").b(agjzVar2.g()) + ')';
                    }
                    strConcat = String.valueOf(atyiVar.b).concat(str);
                } else {
                    if (i3 != 5) {
                        throw new IllegalArgumentException("No transform specified");
                    }
                    strConcat = "defrag";
                }
            } else {
                atyk atykVar = i2 == 2 ? (atyk) atymVar.c : atyk.a;
                int i5 = atykVar.b;
                if (i5 == 1) {
                    strConcat = "encrypt(aes_gcm_key=" + b((String) atykVar.c) + ')';
                } else if (i5 == 2) {
                    strConcat = "encrypt(aes_gcm_hkdf_key=" + b((String) atykVar.c) + ')';
                } else {
                    strConcat = "encrypt";
                }
            }
            agjzVar.h(strConcat);
        }
        return qql.a(agjzVar.g());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
