package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhz {
    public List a;
    public int b = 0;
    private final boolean c;

    public avhz(List list, boolean z) {
        this.c = z;
        d(list);
    }

    private static final List h(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((axoz) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((axoz) list2.get(i));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final SocketAddress b() {
        if (f()) {
            return (SocketAddress) ((axoz) this.a.get(this.b)).b;
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void c() {
        this.b = 0;
    }

    public final void d(List list) {
        List listH;
        list.getClass();
        if (this.c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                auzm auzmVar = (auzm) list.get(i);
                int i2 = 0;
                while (true) {
                    List list2 = auzmVar.e;
                    if (i2 < list2.size()) {
                        SocketAddress socketAddress = (SocketAddress) list2.get(i2);
                        if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            arrayList.add(new axoz(auzmVar.f, socketAddress));
                        } else {
                            if (bool == null) {
                                bool = Boolean.TRUE;
                            }
                            arrayList2.add(new axoz(auzmVar.f, socketAddress));
                        }
                        i2++;
                    }
                }
            }
            listH = (bool == null || !bool.booleanValue()) ? h(arrayList, arrayList2) : h(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                auzm auzmVar2 = (auzm) list.get(i3);
                int i4 = 0;
                while (true) {
                    List list3 = auzmVar2.e;
                    if (i4 < list3.size()) {
                        arrayList3.add(new axoz(auzmVar2.f, (SocketAddress) list3.get(i4)));
                        i4++;
                    }
                }
            }
            listH = arrayList3;
        }
        this.a = listH;
        c();
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        this.b++;
        return f();
    }

    public final boolean f() {
        return this.b < this.a.size();
    }

    public final boolean g(SocketAddress socketAddress) {
        socketAddress.getClass();
        for (int i = 0; i < this.a.size(); i++) {
            if (((axoz) this.a.get(i)).b.equals(socketAddress)) {
                this.b = i;
                return true;
            }
        }
        return false;
    }
}
