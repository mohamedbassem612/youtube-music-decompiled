package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class arp implements arn {
    public final arx d;
    public int e;
    public int f;
    public arn a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    arq h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public arp(arx arxVar) {
        this.d = arxVar;
    }

    public final void a(arn arnVar) {
        this.j.add(arnVar);
        if (this.i) {
            arnVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((arn) it.next()).f();
        }
    }

    @Override // defpackage.arn
    public final void f() {
        List<arp> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((arp) it.next()).i) {
                return;
            }
        }
        this.c = true;
        arn arnVar = this.a;
        if (arnVar != null) {
            arnVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        arp arpVar = null;
        for (arp arpVar2 : list) {
            if (!(arpVar2 instanceof arq)) {
                i++;
                arpVar = arpVar2;
            }
        }
        if (arpVar != null && i == 1 && arpVar.i) {
            arq arqVar = this.h;
            if (arqVar != null) {
                if (!arqVar.i) {
                    return;
                } else {
                    this.e = this.g * arqVar.f;
                }
            }
            c(arpVar.f + this.e);
        }
        arn arnVar2 = this.a;
        if (arnVar2 != null) {
            arnVar2.f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.ai;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        Object objValueOf = this.i ? Integer.valueOf(this.f) : "unresolved";
        List list = this.k;
        List list2 = this.j;
        return str2 + ':' + str + '(' + objValueOf.toString() + ") <t=" + list.size() + ":d=" + list2.size() + '>';
    }
}
