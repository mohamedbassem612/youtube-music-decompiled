package com.google.android.libraries.blocks;

import defpackage.ahad;
import defpackage.ahag;
import defpackage.ahxw;
import defpackage.aiie;
import defpackage.aiov;
import defpackage.asix;
import defpackage.asiy;
import defpackage.asiz;
import defpackage.asja;
import defpackage.asjb;
import defpackage.asjc;
import defpackage.asjd;
import defpackage.hhv;
import defpackage.ixa;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StatusException extends RuntimeException {
    public final asjd a;
    public final aiov b;
    public final ahxw c;

    public StatusException(ahxw ahxwVar, String str, StackTraceElement[] stackTraceElementArr, asjd asjdVar, aiov aiovVar) {
        super(str, new StatusException(ahxwVar, "", stackTraceElementArr, aiovVar));
        this.c = ahxwVar;
        this.a = asjdVar;
        this.b = aiovVar;
        if (asjdVar == null || asjdVar.c.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = asjdVar.c.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                return;
            }
            asjc asjcVar = (asjc) it.next();
            int i2 = asjcVar.b;
            if (i2 == 2) {
                ahag ahagVar = ((asiz) asjcVar.c).c;
                ahad ahadVar = (ahagVar == null ? ahag.a : ahagVar).e;
                Collections.addAll(arrayList, (StackTraceElement[]) Collection.EL.stream((ahadVar == null ? ahad.a : ahadVar).f).map(new ixa(15)).toArray(new hhv(7)));
            } else if (i2 == 1) {
                aiie aiieVar = ((asja) asjcVar.c).e;
                int size = aiieVar.size();
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[size];
                while (i < size) {
                    asjb asjbVar = (asjb) aiieVar.get(i);
                    stackTraceElementArr2[i] = new StackTraceElement("_blocks_js_:" + asjbVar.e, asjbVar.b, asjbVar.c, asjbVar.d);
                    i++;
                }
                Collections.addAll(arrayList, stackTraceElementArr2);
            } else if (i2 == 3) {
                aiie aiieVar2 = ((asix) asjcVar.c).b;
                int size2 = aiieVar2.size();
                StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[size2];
                while (i < size2) {
                    asiy asiyVar = (asiy) aiieVar2.get(i);
                    stackTraceElementArr3[i] = new StackTraceElement("_blocks_cc_", asiyVar.b, asiyVar.c, asiyVar.d);
                    i++;
                }
                Collections.addAll(arrayList, stackTraceElementArr3);
            }
        }
    }

    public StatusException(ahxw ahxwVar, String str, StackTraceElement[] stackTraceElementArr, aiov aiovVar) {
        super(str);
        this.c = ahxwVar;
        this.a = null;
        this.b = aiovVar;
        setStackTrace(stackTraceElementArr);
    }

    public StatusException(ahxw ahxwVar, String str) {
        this(ahxwVar, str, new StackTraceElement[0], null, null);
    }
}
