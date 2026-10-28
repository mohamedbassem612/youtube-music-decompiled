package defpackage;

import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hlu {
    jri b;
    Object c;
    final /* synthetic */ hlv d;
    public final hfn e;

    public hlu(hlv hlvVar, hfn hfnVar) {
        this.d = hlvVar;
        this.e = hfnVar;
    }

    protected abstract Object a(byte[] bArr);

    protected abstract byte[] b(Object obj);

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: all -> 0x0077, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0006, B:19:0x0047, B:21:0x0055, B:26:0x006a, B:24:0x0064, B:7:0x000a, B:12:0x0026, B:16:0x0037, B:18:0x003b, B:31:0x0070, B:14:0x0033, B:10:0x0019), top: B:40:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[Catch: all -> 0x0077, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0006, B:19:0x0047, B:21:0x0055, B:26:0x006a, B:24:0x0064, B:7:0x000a, B:12:0x0026, B:16:0x0037, B:18:0x003b, B:31:0x0070, B:14:0x0033, B:10:0x0019), top: B:40:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0006, B:19:0x0047, B:21:0x0055, B:26:0x006a, B:24:0x0064, B:7:0x000a, B:12:0x0026, B:16:0x0037, B:18:0x003b, B:31:0x0070, B:14:0x0033, B:10:0x0019), top: B:40:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:41:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x006e, please report this as an issue */
    public final synchronized Object c() {
        Object obj;
        byte[] bArrB;
        jri jriVar;
        String str;
        zwb zwbVar;
        obj = null;
        if (this.b == null || this.c == null) {
            Object obj2 = this.e.a;
            if (((File) obj2).exists()) {
                bArrB = agyn.b((File) obj2, new ahng());
            } else {
                bArrB = null;
            }
            if (bArrB != null) {
                try {
                    jriVar = (jri) aihn.parseFrom(jri.a, bArrB, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik unused) {
                    d();
                    jriVar = null;
                }
                this.b = jriVar;
                if (jriVar != null) {
                    try {
                        this.c = a(jriVar.e.G());
                        str = this.b.c;
                        zwbVar = this.d.b;
                        if (zwbVar.u()) {
                            if (TextUtils.equals(zwbVar.e().k(), str)) {
                                obj = this.c;
                            }
                        } else if (TextUtils.isEmpty(str)) {
                            obj = this.c;
                        }
                    } catch (IOException unused2) {
                        d();
                    }
                }
            } else {
                jriVar = null;
                this.b = jriVar;
                if (jriVar != null) {
                    this.c = a(jriVar.e.G());
                    str = this.b.c;
                    zwbVar = this.d.b;
                    if (zwbVar.u()) {
                        if (TextUtils.equals(zwbVar.e().k(), str)) {
                            obj = this.c;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        obj = this.c;
                    }
                }
            }
        } else {
            str = this.b.c;
            zwbVar = this.d.b;
            if (zwbVar.u()) {
                if (TextUtils.equals(zwbVar.e().k(), str)) {
                    obj = this.c;
                }
            } else if (TextUtils.isEmpty(str)) {
                obj = this.c;
            }
        }
        return obj;
    }

    public final synchronized void d() {
        Object obj = this.e.a;
        if (((File) obj).exists()) {
            ((File) obj).delete();
        }
        this.b = null;
        this.c = null;
    }

    public final synchronized void e(Object obj) {
        aihf aihfVarCreateBuilder = jri.a.createBuilder();
        hlv hlvVar = this.d;
        zwb zwbVar = hlvVar.b;
        if (zwbVar.u()) {
            String strK = zwbVar.e().k();
            aihfVarCreateBuilder.copyOnWrite();
            jri jriVar = (jri) aihfVarCreateBuilder.instance;
            jriVar.b |= 1;
            jriVar.c = strK;
        }
        long epochMilli = hlvVar.c.f().toEpochMilli();
        aihfVarCreateBuilder.copyOnWrite();
        jri jriVar2 = (jri) aihfVarCreateBuilder.instance;
        jriVar2.b |= 2;
        jriVar2.d = epochMilli;
        aigj aigjVarV = aigj.v(b(obj));
        aihfVarCreateBuilder.copyOnWrite();
        jri jriVar3 = (jri) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        jriVar3.b |= 4;
        jriVar3.e = aigjVarV;
        this.b = (jri) aihfVarCreateBuilder.build();
        this.c = obj;
        hlvVar.d.execute(new fuc(this, aihfVarCreateBuilder, 16));
    }
}
