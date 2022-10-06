package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O peso do aluno precisa ser positivo.")
    private double peso;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "A altura do aluno precisa ser positivo.")
    @DecimalMin(value = "150", message = "'${validatedvalue}' precisa ser no mínimo {value}.")
    private double altura;
}
