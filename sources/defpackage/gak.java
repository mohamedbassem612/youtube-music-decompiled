package defpackage;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gak {
    public final gbg c;
    public volatile Boolean d;
    public static final ConditionVariable a = new ConditionVariable();
    public static volatile ahek e = null;
    public static volatile Random b = null;

    public gak(gbg gbgVar) {
        this.c = gbgVar;
        gbgVar.b.execute(new fsu(this, 3));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            a.block();
            if (!this.d.booleanValue() || e == null) {
                return;
            }
            aihf aihfVarCreateBuilder = fxb.a.createBuilder();
            String packageName = this.c.a.getPackageName();
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar = (fxb) aihfVarCreateBuilder.instance;
            packageName.getClass();
            fxbVar.b |= 1;
            fxbVar.c = packageName;
            aihfVarCreateBuilder.copyOnWrite();
            fxb fxbVar2 = (fxb) aihfVarCreateBuilder.instance;
            fxbVar2.b |= 2;
            fxbVar2.d = j;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                fxb fxbVar3 = (fxb) aihfVarCreateBuilder.instance;
                fxbVar3.b |= 16;
                fxbVar3.g = str;
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                aihfVarCreateBuilder.copyOnWrite();
                fxb fxbVar4 = (fxb) aihfVarCreateBuilder.instance;
                string.getClass();
                fxbVar4.b |= 4;
                fxbVar4.e = string;
                String name = exc.getClass().getName();
                aihfVarCreateBuilder.copyOnWrite();
                fxb fxbVar5 = (fxb) aihfVarCreateBuilder.instance;
                name.getClass();
                fxbVar5.b |= 8;
                fxbVar5.f = name;
            }
            ahek ahekVar = e;
            byte[] byteArray = ((fxb) aihfVarCreateBuilder.build()).toByteArray();
            if (i2 == -1) {
                i2 = 0;
            }
            ixt.ag(byteArray, i2, i, ahekVar);
        } catch (Exception unused) {
        }
    }
}
