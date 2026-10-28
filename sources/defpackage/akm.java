package defpackage;

import android.database.Cursor;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class akm implements awqk {
    private final /* synthetic */ int $cid;

    public /* synthetic */ akm(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                akq akqVar = (akq) obj;
                ako akoVar = (ako) obj2;
                if (!(akoVar instanceof akk)) {
                    return akqVar.then(akoVar);
                }
                throw null;
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                ako akoVar2 = (ako) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(akoVar2);
                return sb;
            case 2:
                vds vdsVar = (vds) obj;
                Optional optional = (Optional) obj2;
                vdsVar.getClass();
                optional.getClass();
                return new vds(vdsVar.a, (auhs) awrc.f(optional));
            case 3:
                wll.h((String) obj, (Throwable) obj2);
                return awmy.a;
            case 4:
                xhr xhrVar = (xhr) obj2;
                ((String) obj).getClass();
                xhrVar.getClass();
                return xhr.a(xhrVar, false, 6);
            case 5:
                xhr xhrVar2 = (xhr) obj2;
                ((String) obj).getClass();
                xhrVar2.getClass();
                return xhrVar2.c ? xhr.a(xhrVar2, false, 6) : xhrVar2;
            case 6:
                awml awmlVar = (awml) obj;
                abim abimVar = (abim) obj2;
                Duration duration = abin.a;
                awmlVar.getClass();
                abimVar.getClass();
                abim abimVar2 = (abim) awmlVar.a;
                long jLongValue = ((Number) awmlVar.b).longValue();
                String str = abimVar.a;
                if (str.length() == 0 || !awrc.c(abimVar2.a, str)) {
                    jLongValue = 0;
                } else if (abimVar2.b) {
                    long j = abimVar.c - abimVar2.c;
                    if (j > 0 && j < abin.a.toMillis()) {
                        jLongValue += j;
                    }
                }
                return new awml(abimVar, Long.valueOf(jLongValue));
            case 7:
                abxc abxcVar = (abxc) obj;
                acip acipVar = (acip) obj2;
                abxcVar.getClass();
                acipVar.getClass();
                return new abxs(abxcVar, acipVar);
            case 8:
                return awmy.a;
            case 9:
                return awmy.a;
            case 10:
                Cursor cursor = (Cursor) obj2;
                syn synVar = afnp.m;
                ((ahud) obj).getClass();
                awoa awoaVar = new awoa(10);
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                    string.getClass();
                    awoaVar.add(string);
                }
                return awoaVar.f();
            case 11:
                syn synVar2 = afnp.m;
                ((ahud) obj).getClass();
                return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                awos awosVar = (awos) obj2;
                awosVar.getClass();
                String name = awosVar.getClass().getName();
                name.getClass();
                return Boolean.valueOf(awrc.n(name, "androidx.compose.ui.test.AndroidComposeUiTestEnvironment", false) | zBooleanValue);
            case 13:
                String str2 = (String) obj;
                awos awosVar2 = (awos) obj2;
                str2.getClass();
                awosVar2.getClass();
                if (str2.length() == 0) {
                    return awosVar2.toString();
                }
                return str2 + ", " + awosVar2;
            case 14:
                awou awouVar = (awou) obj;
                awos awosVar3 = (awos) obj2;
                return !(awosVar3 instanceof afwr) ? awouVar.plus(awosVar3) : awouVar.plus(((afwr) awosVar3).d());
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }
}
