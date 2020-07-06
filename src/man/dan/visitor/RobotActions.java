package man.dan.visitor;

import man.dan.errors.SemanticSakeError;
import man.dan.langobj.Rippotai;

public class RobotActions {
    protected SakeVisitor visitor;

    protected RobotActions(SakeVisitor owner) {
        visitor = owner;
    }

    protected void completeUp(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx();
        int y = visitor.getTravelVis().getRy();
        int z = visitor.getTravelVis().getRz() + 1;

        for (; z <= visitor.getTravelVis().getRz() + dist; ++z) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRz() + dist < Rippotai.maxCoord)
            visitor.getOpenCubes().add(new Rippotai(x, y, visitor.getTravelVis().getRz() + dist + 1, true));
    }

    protected void completeDown(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx();
        int y = visitor.getTravelVis().getRy();
        int z = visitor.getTravelVis().getRz() - 1;

        for (; z >= visitor.getTravelVis().getRz() - dist; --z) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRz() - dist > Rippotai.minCoord)
            visitor.getOpenCubes().add(new Rippotai(x, y, visitor.getTravelVis().getRz() - dist - 1, true));
    }

    protected void completeLeft(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx() - 1;
        int y = visitor.getTravelVis().getRy();
        int z = visitor.getTravelVis().getRz();

        for (; x >= visitor.getTravelVis().getRx() - dist; --x) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRx() - dist > Rippotai.minCoord)
            visitor.getOpenCubes().add(new Rippotai(visitor.getTravelVis().getRx() - dist - 1, y, z, true));
    }

    protected void completeRight(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx() + 1;
        int y = visitor.getTravelVis().getRy();
        int z = visitor.getTravelVis().getRz();

        for (; x <= visitor.getTravelVis().getRx() + dist; ++x) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRx() + dist < Rippotai.maxCoord)
            visitor.getOpenCubes().add(new Rippotai(visitor.getTravelVis().getRx() + dist + 1, y, z, true));
    }

    protected void completeForward(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx();
        int y = visitor.getTravelVis().getRy() + 1;
        int z = visitor.getTravelVis().getRz();

        for (; y <= visitor.getTravelVis().getRy() + dist; ++y) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRy() + dist < Rippotai.maxCoord)
            visitor.getOpenCubes().add(new Rippotai(x, visitor.getTravelVis().getRy() + dist + 1, z, true));
    }

    protected void completeBack(int dist) throws SemanticSakeError {
        int x = visitor.getTravelVis().getRx();
        int y = visitor.getTravelVis().getRy() - 1;
        int z = visitor.getTravelVis().getRz();

        for (; y >= visitor.getTravelVis().getRy() - dist; --y) {
            visitor.getOpenCubes().add(new Rippotai(x, y, z, false));
        }

        if (visitor.getTravelVis().getRy() - dist > Rippotai.minCoord)
            visitor.getOpenCubes().add(new Rippotai(x, visitor.getTravelVis().getRy() - dist - 1, z, true));
    }
}
