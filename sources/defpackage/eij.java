package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eij implements eik, eih {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final eks e;

    public eij(eks eksVar) {
        this.e = eksVar;
    }

    private final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            eik eikVar = (eik) list.get(size);
            if (eikVar instanceof eib) {
                eib eibVar = (eib) eikVar;
                List listJ = eibVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((eik) listJ.get(size2)).i();
                        pathI.transform(eibVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(eikVar.i());
            }
        }
        eik eikVar2 = (eik) list.get(0);
        if (eikVar2 instanceof eib) {
            eib eibVar2 = (eib) eikVar2;
            List listJ2 = eibVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                Path pathI2 = ((eik) listJ2.get(i)).i();
                pathI2.transform(eibVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(eikVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((eik) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.eia
    public final String g() {
        throw null;
    }

    @Override // defpackage.eih
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            eia eiaVar = (eia) listIterator.previous();
            if (eiaVar instanceof eik) {
                this.d.add((eik) eiaVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.eik
    public final Path i() {
        Path path = this.c;
        path.reset();
        eks eksVar = this.e;
        if (!eksVar.a) {
            int i = eksVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    List list = this.d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((eik) list.get(i3)).i());
                    i3++;
                }
            } else if (i2 == 1) {
                a(Path.Op.UNION);
            } else if (i2 == 2) {
                a(Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                a(Path.Op.INTERSECT);
            } else if (i2 == 4) {
                a(Path.Op.XOR);
            }
        }
        return path;
    }
}
