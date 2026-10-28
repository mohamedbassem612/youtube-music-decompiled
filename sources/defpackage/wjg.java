package defpackage;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjg {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public wjg() {
        this.a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [tny] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final wji a() {
        ?? tnbVar;
        if (this.g == null) {
            Object obj = this.h;
            if (obj != null) {
                Object obj2 = this.b;
                obj2.getClass();
                Object obj3 = this.f;
                obj3.getClass();
                this.g = wji.ai((wjb) obj, (alvt) obj2, ((Long) obj3).longValue());
            } else {
                this.g = wja.c;
            }
        }
        if (this.b == null) {
            this.g.getClass();
            aihh aihhVar = (aihh) alvt.a.createBuilder();
            aihf aihfVarCreateBuilder = alvw.a.createBuilder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j = ((wja) this.g).h / 1000;
            aihfVarCreateBuilder.copyOnWrite();
            alvw alvwVar = (alvw) aihfVarCreateBuilder.instance;
            alvwVar.b |= 4;
            alvwVar.e = j;
            aihhVar.copyOnWrite();
            alvt alvtVar = (alvt) aihhVar.instance;
            alvw alvwVar2 = (alvw) aihfVarCreateBuilder.build();
            alvwVar2.getClass();
            alvtVar.g = alvwVar2;
            alvtVar.b |= 8;
            this.b = (alvt) aihhVar.build();
        }
        if (this.f == null) {
            Object obj4 = this.g;
            obj4.getClass();
            this.f = Long.valueOf(((wja) obj4).i);
        }
        Object obj5 = this.b;
        Object obj6 = this.c;
        long jLongValue = ((Long) this.f).longValue();
        Object obj7 = this.g;
        Object wjhVar = this.d;
        if (wjhVar == null) {
            Object obj8 = this.e;
            if (obj8 == null) {
                tnbVar = obj8;
                tnbVar = new tnb(null);
            }
            tnbVar = obj8;
            wjhVar = new wjh(tnbVar);
        }
        return new wji((alvt) obj5, (Instant) obj6, jLongValue, (wja) obj7, (wjh) wjhVar, this.a);
    }

    public final void b(long j) {
        this.f = Long.valueOf(j);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final ShortcutInfo c() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder((Context) this.e, (String) this.b).setShortLabel(this.d).setIntents((Intent[]) this.c);
        Object obj = this.h;
        if (obj != null) {
            intents.setIcon(aaj.e((IconCompat) obj, (Context) this.e));
        }
        intents.setRank(0);
        Object obj2 = this.g;
        if (obj2 != null) {
            intents.setExtras((PersistableBundle) obj2);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj3 = this.f;
            if (obj3 != null) {
                intents.setPersons(new Person[]{ats.b(((avc[]) obj3)[0])});
            }
            intents.setLongLived(this.a);
        } else {
            if (this.g == null) {
                this.g = new PersistableBundle();
            }
            if (this.f != null) {
                ((PersistableBundle) this.g).putInt("extraPersonCount", 1);
                char c = 0;
                while (true) {
                    avc[] avcVarArr = (avc[]) this.f;
                    int length = avcVarArr.length;
                    if (c > 0) {
                        break;
                    }
                    Object obj4 = this.g;
                    avc avcVar = avcVarArr[0];
                    PersistableBundle persistableBundle = new PersistableBundle();
                    CharSequence charSequence = avcVar.a;
                    persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle.putString("uri", avcVar.c);
                    persistableBundle.putString("key", avcVar.d);
                    persistableBundle.putBoolean("isBot", avcVar.e);
                    persistableBundle.putBoolean("isImportant", avcVar.f);
                    ((PersistableBundle) obj4).putPersistableBundle("extraPerson_1", persistableBundle);
                    c = 1;
                }
            }
            ((PersistableBundle) this.g).putBoolean("extraLongLived", this.a);
            intents.setExtras((PersistableBundle) this.g);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        return intents.build();
    }

    public wjg(byte[] bArr) {
    }
}
