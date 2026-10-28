package j$.desugar.sun.nio.fs;

import j$.nio.file.FileSystem;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.e0;
import j$.nio.file.h0;
import j$.nio.file.n0;
import j$.nio.file.q0;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p implements Path {
    public static final Pattern h = Pattern.compile("/+");
    public final FileSystem a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public p(FileSystem fileSystem, String str, String str2, String str3) {
        this(fileSystem, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(h.split(str)).filter(new o((byte) 0)).collect(new j$.util.stream.i(new o((byte) 16), new o((byte) 17), new o((byte) 18), new o((byte) 19), Collectors.c)), str2, str3);
    }

    @Override // j$.nio.file.Path, j$.nio.file.t0
    public final n0 c(q0 q0Var, e0[] e0VarArr, h0... h0VarArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return o(new p(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof p) && compareTo((p) obj) == 0;
    }

    @Override // j$.nio.file.Path, j$.nio.file.t0
    public final n0 f(q0 q0Var, e0... e0VarArr) {
        c(q0Var, e0VarArr, new h0[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new p(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final FileSystem getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        String str = this.f;
        return new p(this.a, str, this.e, str);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final p getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new p(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.n(this);
    }

    @Override // j$.nio.file.Path
    public final Path j(LinkOption[] linkOptionArr) {
        FileSystem fileSystem = this.a;
        fileSystem.h().a(this, j$.nio.file.b.READ);
        return Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new p(fileSystem, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final p getParent() {
        List list = this.c;
        int size = list.size();
        if (size != 0) {
            boolean z = this.d;
            if (size != 1 || z) {
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append("/");
                }
                sb.append(g.B(list.subList(0, size - 1)));
                return new p(this.a, sb.toString(), this.e, this.f);
            }
        }
        return null;
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final p i(Path path) {
        if (!(path instanceof p)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        p pVar = (p) path;
        if (pVar.d) {
            return pVar;
        }
        return new p(this.a, this.b + "/" + String.valueOf(path), this.e, this.f);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((p) path).b);
    }

    @Override // j$.nio.file.Path
    public final boolean n(Path path) {
        int nameCount;
        path.getClass();
        if (!(path instanceof p) || this.d != path.isAbsolute() || this.c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new p(this.a, (this.d ? "/" : "").concat(g.B(arrayDeque)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean o(Path path) {
        path.getClass();
        if (!(path instanceof p)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final p q(Path path) {
        path.getClass();
        if (!(path instanceof p)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        p parent = getParent();
        return parent == null ? (p) path : parent.i(path);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final p toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.e;
        return new p(this.a, str, str, this.f).i(this);
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return i(getFileSystem().getPath(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return q(new p(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return n(new p(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new p(this.a, g.B(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = q.c;
        p absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(r.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = q.a;
            long j2 = q.b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : ((1 << c) & j) == 0) {
                sb.append('%');
                char[] cArr2 = q.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    public final Path u(Path path) {
        int i = 0;
        if (!(path instanceof p)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        p pVar = (p) path;
        if (this.d != pVar.d) {
            j$.time.g.a("'other' is different type of Path in absolute property.");
            return null;
        }
        List list = pVar.c;
        List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new p(this.a, false, arrayList, this.e, this.f);
    }

    public p(FileSystem fileSystem, boolean z, List list, String str, String str2) {
        this.a = fileSystem;
        this.d = z;
        this.c = list;
        this.b = (z ? "/" : "").concat(g.B(list));
        this.e = str;
        this.f = str2;
    }
}
