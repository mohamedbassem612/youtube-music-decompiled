package j$.nio.file;

import java.nio.file.AccessMode;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ b a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        if (accessMode == AccessMode.READ) {
            return b.READ;
        }
        return accessMode == AccessMode.WRITE ? b.WRITE : b.EXECUTE;
    }

    public static e0 b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
            return z.b;
        }
        if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
            return z.c;
        }
        if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
            return z.d;
        }
        if (kind == StandardWatchEventKinds.OVERFLOW) {
            return z.a;
        }
        return kind instanceof d0 ? ((d0) kind).a : new c0(kind);
    }

    public static /* synthetic */ java.nio.file.LinkOption c(LinkOption linkOption) {
        if (linkOption == null) {
            return null;
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public static /* synthetic */ java.nio.file.StandardCopyOption d(StandardCopyOption standardCopyOption) {
        if (standardCopyOption == StandardCopyOption.REPLACE_EXISTING) {
            return java.nio.file.StandardCopyOption.REPLACE_EXISTING;
        }
        return standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public static /* synthetic */ StandardOpenOption e(x xVar) {
        if (xVar == x.READ) {
            return StandardOpenOption.READ;
        }
        if (xVar == x.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (xVar == x.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (xVar == x.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (xVar == x.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (xVar == x.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (xVar == x.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (xVar == x.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return xVar == x.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static WatchEvent.Kind f(e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        if (e0Var == z.b) {
            return StandardWatchEventKinds.ENTRY_CREATE;
        }
        if (e0Var == z.c) {
            return StandardWatchEventKinds.ENTRY_DELETE;
        }
        if (e0Var == z.d) {
            return StandardWatchEventKinds.ENTRY_MODIFY;
        }
        if (e0Var == z.a) {
            return StandardWatchEventKinds.OVERFLOW;
        }
        return e0Var instanceof c0 ? ((c0) e0Var).a : new d0(e0Var);
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return p.h((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? o.h((java.nio.file.Path) obj) : obj;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        Class cls2 = BasicFileAttributeView.class;
        Class cls3 = j$.nio.file.attribute.g.class;
        if (cls != cls2) {
            if (cls != cls3) {
                cls2 = PosixFileAttributeView.class;
                cls3 = j$.nio.file.attribute.l0.class;
                if (cls != cls2) {
                    if (cls != cls3) {
                        cls2 = FileOwnerAttributeView.class;
                        cls3 = j$.nio.file.attribute.a0.class;
                        if (cls != cls2) {
                            if (cls != cls3) {
                                cls2 = j$.nio.file.attribute.m.class;
                                if (cls == cls2) {
                                    return DosFileAttributeView.class;
                                }
                                if (cls != DosFileAttributeView.class) {
                                    cls2 = j$.nio.file.attribute.s0.class;
                                    if (cls == cls2) {
                                        return UserDefinedFileAttributeView.class;
                                    }
                                    if (cls != UserDefinedFileAttributeView.class) {
                                        cls2 = j$.nio.file.attribute.c.class;
                                        if (cls == cls2) {
                                            return AclFileAttributeView.class;
                                        }
                                        if (cls != AclFileAttributeView.class) {
                                            j$.util.e.a("java.nio.file.attribute.FileAttributeView", cls);
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return cls2;
        }
        return cls3;
    }

    public static Class i(Class cls) {
        if (cls == null) {
            return null;
        }
        Class cls2 = BasicFileAttributes.class;
        Class cls3 = j$.nio.file.attribute.j.class;
        if (cls != cls2) {
            if (cls != cls3) {
                cls2 = PosixFileAttributes.class;
                cls3 = j$.nio.file.attribute.o0.class;
                if (cls != cls2) {
                    if (cls != cls3) {
                        cls2 = j$.nio.file.attribute.p.class;
                        if (cls == cls2) {
                            return DosFileAttributes.class;
                        }
                        if (cls != DosFileAttributes.class) {
                            j$.util.e.a("java.nio.file.attribute.BasicFileAttributes", cls);
                            throw null;
                        }
                    }
                }
            }
            return cls2;
        }
        return cls3;
    }

    public static Map j(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, k(map.get(str)));
        }
        return map2;
    }

    public static Object k(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return j$.nio.file.attribute.u.b((FileTime) obj);
            } catch (ClassCastException e) {
                j$.util.e.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.f0)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.u.c((j$.nio.file.attribute.f0) obj);
        } catch (ClassCastException e2) {
            j$.util.e.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof m) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(l.a((m) it.next()));
                } catch (ClassCastException e) {
                    j$.util.e.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                j$.util.e.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(k.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set m(Set set) {
        j$.nio.file.attribute.p0 p0Var;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.p0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.p0 p0Var2 = (j$.nio.file.attribute.p0) it.next();
                    if (p0Var2 == null) {
                        posixFilePermission = null;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (p0Var2 == j$.nio.file.attribute.p0.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = p0Var2 == j$.nio.file.attribute.p0.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    j$.util.e.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.e.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        p0Var = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        p0Var = j$.nio.file.attribute.p0.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        p0Var = j$.nio.file.attribute.p0.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        p0Var = j$.nio.file.attribute.p0.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        p0Var = j$.nio.file.attribute.p0.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        p0Var = j$.nio.file.attribute.p0.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        p0Var = j$.nio.file.attribute.p0.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        p0Var = j$.nio.file.attribute.p0.OTHERS_READ;
                    } else {
                        p0Var = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.p0.OTHERS_WRITE : j$.nio.file.attribute.p0.OTHERS_EXECUTE;
                    }
                    hashSet.add(p0Var);
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static List n(List list) {
        k0 i0Var;
        WatchEvent j0Var;
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof k0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    k0 k0Var = (k0) it.next();
                    if (k0Var == null) {
                        j0Var = null;
                    } else {
                        j0Var = k0Var instanceof i0 ? ((i0) k0Var).a : new j0(k0Var);
                    }
                    arrayList.add(j0Var);
                } catch (ClassCastException e) {
                    j$.util.e.a("java.nio.file.WatchEvent", e);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                j$.util.e.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    if (watchEvent == null) {
                        i0Var = null;
                    } else {
                        i0Var = watchEvent instanceof j0 ? ((j0) watchEvent).a : new i0(watchEvent);
                    }
                    arrayList.add(i0Var);
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
