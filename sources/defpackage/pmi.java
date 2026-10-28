package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pmi {
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    private final String g;
    private final Integer h;
    private final int i;
    private final int j;

    public pmi(String str, int i, int i2, int i3, Integer num, String str2, byte[] bArr, String str3, String str4, String str5) {
        this.g = str;
        this.f = i;
        this.i = i2;
        this.j = i3;
        this.h = num;
        this.a = str2;
        this.b = bArr;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static pmi a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        String stringExtra = intent.getStringExtra("casp");
        String stringExtra2 = intent.getStringExtra("chm");
        int iD = d(intent.getStringExtra("google.original_priority"));
        int iD2 = d(intent.getStringExtra("google.delivered_priority"));
        int iC = c(intent.getStringExtra("message_type"));
        String stringExtra3 = intent.getStringExtra("ki");
        String stringExtra4 = intent.getStringExtra("cid");
        Integer numValueOf = !intent.hasExtra("google.ttl") ? null : Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        if (numValueOf == null) {
            numValueOf = null;
        }
        String stringExtra5 = intent.getStringExtra("google.message_id");
        return new pmi(true == TextUtils.isEmpty(stringExtra5) ? null : stringExtra5, iC, iD, iD2, numValueOf, stringExtra, byteArrayExtra, stringExtra2, stringExtra3, stringExtra4);
    }

    public static int c(String str) {
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -2062414158:
                return str.equals("deleted_messages") ? 3 : 1;
            case 102161:
                return str.equals("gcm") ? 2 : 1;
            case 814694033:
                return str.equals("send_error") ? 5 : 1;
            case 814800675:
                return str.equals("send_event") ? 4 : 1;
            default:
                return 1;
        }
    }

    private static int d(String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1039745817) {
            return (iHashCode == 3202466 && str.equals("high")) ? 3 : 1;
        }
        return str.equals(Fonts.Font.STYLE_NORMAL) ? 2 : 1;
    }

    private static int e(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 == 2 ? 3 : 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    public final ahyr b() {
        aihf aihfVarCreateBuilder = ahyr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahyr ahyrVar = (ahyr) aihfVarCreateBuilder.instance;
        ahyrVar.e = e(this.i) - 1;
        int i = 4;
        ahyrVar.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        ahyr ahyrVar2 = (ahyr) aihfVarCreateBuilder.instance;
        ahyrVar2.f = e(this.j) - 1;
        ahyrVar2.b |= 8;
        int i2 = this.f;
        if (i2 == 0) {
            i = 1;
        } else {
            int i3 = i2 - 1;
            if (i3 == 1) {
                i = 2;
            } else if (i3 == 2) {
                i = 3;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    i = 1;
                } else {
                    i = 5;
                }
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        ahyr ahyrVar3 = (ahyr) aihfVarCreateBuilder.instance;
        ahyrVar3.d = i - 1;
        ahyrVar3.b |= 2;
        String str = this.g;
        if (!TextUtils.isEmpty(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            ahyr ahyrVar4 = (ahyr) aihfVarCreateBuilder.instance;
            str.getClass();
            ahyrVar4.b |= 1;
            ahyrVar4.c = str;
        }
        return (ahyr) aihfVarCreateBuilder.build();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pmi) {
            pmi pmiVar = (pmi) obj;
            String str3 = this.g;
            if (str3 != null ? str3.equals(pmiVar.g) : pmiVar.g == null) {
                int i = this.f;
                if (i != 0 ? i == pmiVar.f : pmiVar.f == 0) {
                    int i2 = this.i;
                    if (i2 != 0 ? i2 == pmiVar.i : pmiVar.i == 0) {
                        int i3 = this.j;
                        if (i3 != 0 ? i3 == pmiVar.j : pmiVar.j == 0) {
                            Integer num = this.h;
                            if (num != null ? num.equals(pmiVar.h) : pmiVar.h == null) {
                                String str4 = this.a;
                                if (str4 != null ? str4.equals(pmiVar.a) : pmiVar.a == null) {
                                    boolean z = pmiVar instanceof pmi;
                                    if (Arrays.equals(this.b, pmiVar.b) && ((str = this.c) != null ? str.equals(pmiVar.c) : pmiVar.c == null) && ((str2 = this.d) != null ? str2.equals(pmiVar.d) : pmiVar.d == null)) {
                                        String str5 = this.e;
                                        if (str5 == null) {
                                            if (pmiVar.e == null) {
                                                return true;
                                            }
                                        } else if (str5.equals(pmiVar.e)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.g;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode ^ 1000003;
        int i3 = this.i;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = ((((i2 * 1000003) ^ i) * 1000003) ^ i3) * 1000003;
        int i5 = this.j;
        if (i5 == 0) {
            i5 = 0;
        }
        int i6 = (i4 ^ i5) * 1000003;
        Integer num = this.h;
        int iHashCode2 = (i6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.a;
        int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003;
        String str3 = this.c;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.e;
        return iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 1) {
            str = "MESSAGE_TYPE_UNSPECIFIED";
        } else if (i == 2) {
            str = "MESSAGE";
        } else if (i == 3) {
            str = "DELETED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "SEND_ERROR";
        } else {
            str = "SEND_EVENT";
        }
        String str2 = this.g;
        int i2 = this.i;
        int i3 = this.j;
        Integer num = this.h;
        String str3 = this.a;
        byte[] bArr = this.b;
        String str4 = this.c;
        String str5 = this.d;
        String str6 = this.e;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + nww.a(i2) + ", priorityDelivered=" + nww.a(i3) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + ", clientId=" + str6 + '}';
    }

    public pmi() {
        throw null;
    }
}
