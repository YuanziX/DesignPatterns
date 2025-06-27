package Prototype;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ForegroundObject implements GraphicalObject {

    @Override
    public ForegroundObject clone() {
        return new ForegroundObject();
    }

}